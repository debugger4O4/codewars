# https://www.codewars.com/kata/5286b2e162056fd0cb000c20/train/python

def collatz(n):
    result = [str(n)]
    while n != 1:
        if n % 2 == 0:
            n = n / 2
        else:
            n = 3 * n + 1
        result.append(str(int(n)))
    return '->'.join(result)