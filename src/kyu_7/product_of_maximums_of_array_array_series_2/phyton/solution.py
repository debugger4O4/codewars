def max_product(lst, n_largest_elements):
    sor_lst = sorted(lst, reverse=True)[:n_largest_elements]
    mul = 1
    for n in sor_lst:
        mul *= n
    return mul