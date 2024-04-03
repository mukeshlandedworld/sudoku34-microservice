
document.getElementById('sudokuForm').addEventListener('submit', async function(event) {
    event.preventDefault();
    const row = document.getElementById('row').value;
    const col = document.getElementById('col').value;
    const num = document.getElementById('num').value;

    // Check if the number is a single digit
    if (num.length !== 1 || isNaN(num)) {
        alert('Please enter a single-digit number.');
        return;
    }

    // const response = await fetch(`http://localhost:8080/validate?row=${row}&col=${col}&num=${num}`);
    const response = await fetch(`https://sudoku-microservice.azurewebsites.net/validate?row=${row}&col=${col}&num=${num}`);
    const result = await response.text();
    alert(result);
});
