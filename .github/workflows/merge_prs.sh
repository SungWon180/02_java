#!/bin/bash

echo "Pull requests merge starts..."

# 1. JSON 포맷으로 PR 번호만 깔끔하게 추출합니다. (가장 중요)
# --json number : 번호 정보만 요청
# --jq '.[].number' : JSON 결과에서 번호 값만 배열로 추출
pr_numbers=$(gh pr list --state open --json number --jq '.[].number')

# 2. PR이 없는 경우 처리
if [ -z "$pr_numbers" ]; then
  echo "Open pull requests : 0"
  echo "Nothing to merge."
  exit 0
fi

# 3. 배열로 변환
# 줄바꿈 문자를 기준으로 배열 생성
readarray -t pr_nums <<< "$pr_numbers"

echo "Open pull requests count : ${#pr_nums[@]}"
echo "Target PR Numbers : ${pr_nums[@]}"

# 4. 반복문으로 머지 수행
for num in "${pr_nums[@]}"
do
    echo "Try merging PR #$num ..."
    
    # --admin : 관리자 권한으로 강제 머지 (브랜치 보호 규칙 우회)
    # --merge : 머지 커밋 방식 사용 (rebase나 squash를 원하면 옵션 변경)
    # || echo ... : 실패하더라도 스크립트가 멈추지 않고 에러 메시지 출력 후 다음으로 진행
    gh pr merge "$num" --merge --admin || echo "❌ Failed to merge PR #$num (Check for conflicts)"
    
    sleep 1
done

echo "All process finished."
