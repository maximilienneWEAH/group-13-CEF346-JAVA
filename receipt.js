const receipts = [
  {
    id: "RCP-001",
    name: "Rosy Winko",
    date: "2025-05-26",
    service: "Electricity",
    amount: "6000 cfa"
  },
  {
    id: "RCP-002",
    name: "Estelle",
    date: "2025-05-25",
    service: "Water",
    amount: "32500 cfa"
  },
  {
    id: "RCP-003",
    name: "Maximilienne",
    date: "2025-05-23",
    service: "Internet",
    amount: "4500 cfa"
  }
];

const receiptContainer = document.getElementById("receiptContainer");

receipts.forEach((r, index) => {
  const card = document.createElement("div");
  card.className = "receipt-card";

  card.innerHTML = `
    <div class="receipt-info">
      <p><strong>Receipt ID:</strong> ${r.id}</p>
      <p><strong>Service:</strong> ${r.service}</p>
      <p><strong>Amount:</strong> ${r.amount}</p>
      <p><strong>Date:</strong> ${r.date}</p>
    </div>
    <button class="download-btn" onclick="downloadPDF(${index})">Download</button>
  `;

  receiptContainer.appendChild(card);
});

window.downloadPDF = function(index) {
  const { jsPDF } = window.jspdf;
  const doc = new jsPDF();

  const r = receipts[index];

  doc.setFontSize(18);
  doc.text("easybank Official Receipt", 20, 20);
  doc.setFontSize(12);
  doc.text(`Receipt ID: ${r.id}`, 20, 40);
  doc.text(`Name: ${r.name}`, 20, 50);
  doc.text(`Service: ${r.service}`, 20, 60);
  doc.text(`Amount Paid: ${r.amount}`, 20, 70);
  doc.text(`Payment Date: ${r.date}`, 20, 80);
  doc.text("Status: ✅ Paid in Full", 20, 90);

  doc.save(`${r.id}_receipt.pdf`);
};