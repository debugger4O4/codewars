def triangle(row):
    d = {
        ('G','G'): 'G', ('B','B'): 'B', ('R','R'): 'R',
        ('B','R'): 'G', ('B','G'): 'R', ('G','B'): 'R',
        ('G','R'): 'B', ('R','G'): 'B', ('R','B'): 'G'
    }
    reduce = [3**i+1 for i in range(10) if 3**i<=100_000][::-1]
    for length in reduce:
        while len(row) >= length:
            row = [d[row[i], row[i+length-1]] for i in range(len(row)-length+1)]
    return row[0]