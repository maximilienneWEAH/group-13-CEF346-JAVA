document.getElementById('paymentForm').addEventListener('submit', function(e) {
  e.preventDefault();

  const name = document.getElementById('name').value.trim();
  const account = document.getElementById('account').value.trim();
  const amount = document.getElementById('amount').value.trim();

  if (name && account && amount) {
    // Placeholder logic – you could connect to backend later
    document.getElementById('paymentMessage').textContent =
      `✅ Payment of ${amount} cfa by ${name} (Acct: ${account}) was successful.`;
  } else {
    document.getElementById('paymentMessage').textContent =
      `⚠️ Please fill in all fields.`;
  }
});