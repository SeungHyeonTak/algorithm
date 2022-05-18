def solution(s):
    answer = len(s)

    for i in range(1, len(s) // 2 + 1):
        s_str = ''
        prev = s[0:i]
        count = 1
        for j in range(i, len(s), i):
            if prev == s[j:j + i]:
                count += 1
            else:
                s_str += str(count) + prev if count >= 2 else prev
                prev = s[j:j+i]
                count = 1
        s_str += str(count) + prev if count >= 2 else prev

        answer = min(answer, len(s_str))

    return answer


if __name__ == '__main__':
    # s = 'aabbaccc'
    s = 'abcabcabcabcdededededede'
    print(solution(s))
