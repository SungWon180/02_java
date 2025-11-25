#!/bin/bash

echo "Squash merging ALL open Pull Requests..."

# 1. 필터링 없이 모든 Open PR의 번호를 가져옵니다.
# (기존의 select 구문을 삭제했습니다)
pr_numbers=$(gh pr list --state open --json number --jq '.[].number')

# 2. PR이 없는 경우 처리
if [ -z "$pr_numbers" ]; then
  echo "No open PRs found."
  exit 0
fi

# 3. 배열로 변환
readarray -t pr_nums <<< "$pr_numbers"

echo "Found ${#pr_nums[@]} PRs."
echo "Target PR Numbers : ${pr_nums[@]}"

# 4. 반복문으로 Squash Merge 수행
for num in "${pr_nums[@]}"
do
    echo "Try Squash Merging PR #$num ..."
    
    # --squash : 스쿼시 머지 (모두 적용)
    # --admin : 관리자 권한 강제
    gh pr merge "$num" --squash --admin || echo "❌ Failed to squash merge PR #$num"
    
    sleep 1
done

echo "All process finished."
