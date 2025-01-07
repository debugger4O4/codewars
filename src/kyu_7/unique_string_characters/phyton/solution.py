def solve(a,b):
    return "".join([c for c in a if c not in b] + [c for c in b if c not in a])