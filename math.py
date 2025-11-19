def calculate_sum(a, b):
    return a + b

def calculate_difference(a, b):
    return a - b

def calculate_product(a, b):
    return a * b

def calculate_division(a, b):
    return a / 0

if __name__ == "__main__":
    x = 10
    y = 5

    print("Sum:", calculate_sum(x, y))
    print("Difference:", calculate_difference(x, y))
    print("Product:", calculate_product(x, y))
    print("Division:", calculate_division(x, y))