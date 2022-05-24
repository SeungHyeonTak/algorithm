def solution(record):
    answer = []
    uid_dict = {}
    result = []

    for i in record:
        ans = i.split(' ')
        if ans[0] == 'Enter':  # 입장
            if ans[1] in uid_dict:
                answer.append(f'{ans[1]} Enter')
                uid_dict.update({ans[1]: ans[2]})
            else:
                answer.append(f'{ans[1]} Enter')
                uid_dict.update({ans[1]: ans[2]})
        elif ans[0] == 'Leave':  # 퇴장
            answer.append(f'{ans[1]} Leave')
        else:  # 변경
            uid_dict.update({ans[1]: ans[2]})
            answer.append(f'{ans[1]} Change')

    for i in range(0, len(answer)):
        temp = answer[i].split(' ')
        if temp[1] == 'Enter':
            result.append(f'{uid_dict.get(temp[0])}님이 들어왔습니다.')
        elif temp[1] == 'Leave':
            result.append(f'{uid_dict.get(temp[0])}님이 나갔습니다.')

    return result


if __name__ == '__main__':
    recode = [
        'Enter uid1234 Muzi', 'Enter uid4567 Prodo',
        'Leave uid1234', 'Enter uid1234 Prodo', 'Change uid4567 Ryan',
    ]
    print(solution(recode))
