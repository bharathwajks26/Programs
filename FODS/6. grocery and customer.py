
prices = [2.5, 3.0, 1.75, 4.5, 2.0]
quantities = [5, 3, 2, 4, 6]
discount = 10 
tax = 8       

before_discount = sum(price * quantity for price, quantity in zip(prices, quantities))

discount_amount = (discount / 100) * before_discount

after_discount = before_discount - discount_amount

tax_amount = (tax/ 100) * after_discount

final = after_discount + tax_amount

print(f"Total cost before discounts: {before_discount:.2f}")
print(f"Discount amount: ${discount_amount:.2f}")
print(f"Total cost after discounts: {after_discount:.2f}")
print(f"Tax amount: ${tax_amount:.2f}")
print(f"Final total cost: ${final:.2f}")


'''
sample output 
Total cost before discounts: 55.00
Discount amount: $5.50
Total cost after discounts: 49.50
Tax amount: $3.96
Final total cost: $53.46
'''