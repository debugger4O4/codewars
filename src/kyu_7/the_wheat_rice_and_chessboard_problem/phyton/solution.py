# https://www.codewars.com/kata/5b0d67c1cb35dfa10b0022c7/train/phyton

def squares_needed(grains):
    a = 0
    b = 1
    while b <= grains:
        b *= 2
        a += 1
    return a