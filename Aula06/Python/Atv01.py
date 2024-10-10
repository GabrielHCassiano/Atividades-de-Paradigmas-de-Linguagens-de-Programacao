class StringPayment:
    def pay(self, amount):
        print(f"Pagamento de ${amount} via Stripe processado.")

class PaypalPayment:
    def send_payment(self, amount):
        print(f"Pagamento de ${amount} via PayPal processado.")

class PaypalAdapter(StringPayment):
    def __init__(self, paypal_payment):
        self.paypal_payment = paypal_payment
    
    def pay(self, amount):
        self.paypal_payment.send_payment(amount)

def process_payment(payment_System, amount):
    payment_System.pay(amount)

stripe_payment = StringPayment()
paypal_payment = PaypalAdapter(PaypalPayment())

process_payment(stripe_payment, 100)
process_payment(paypal_payment, 200)
