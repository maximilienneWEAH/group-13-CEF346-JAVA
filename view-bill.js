const bills = [
  {
    id: 'INV001',
    service: 'Electricity',
    amount: '45000 cfa',
    status: 'Paid',
    date: '2025-05-15'
  },
  {
    id: 'INV002',
    service: 'Water',
    amount: '3000 cfa',
    status: 'Unpaid',
    date: '2025-05-20'
  },
  {
    id: 'INV003',
    service: 'Internet',
    amount: '5500 cfa',
    status: 'Paid',
    date: '2025-05-10'
  },
  {
    id: 'INV004',
    service: 'Trash Pickup',
    amount: '2000 cfa',
    status: 'Unpaid',
    date: '2025-05-21'
  }
];

const tableBody = document.getElementById('billTableBody');

bills.forEach(bill => {
  const row = document.createElement('tr');

  row.innerHTML = `
    <td>${bill.id}</td>
    <td>${bill.service}</td>
    <td>${bill.amount}</td>
    <td class="${bill.status === 'Paid' ? 'status-paid' : 'status-unpaid'}">${bill.status}</td>
    <td>${bill.date}</td>
  `;

  tableBody.appendChild(row);
});
