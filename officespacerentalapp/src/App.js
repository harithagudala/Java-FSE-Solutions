function App() {

  const offices = [
    {
      Name: "ABC Tech Park",
      Rent: 55000,
      Address: "Madhapur, Hyderabad"
    },
    {
      Name: "Cyber Towers",
      Rent: 75000,
      Address: "Hitech City, Hyderabad"
    },
    {
      Name: "DLF Building",
      Rent: 60000,
      Address: "Gachibowli, Hyderabad"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src="https://images.unsplash.com/photo-1497366811353-6870744d04b2"
        alt="Office Space"
        width="500"
      />

      <h2>Available Office Spaces</h2>

      {offices.map((office, index) => (

        <div
          key={index}
          style={{
            border: "1px solid black",
            padding: "10px",
            margin: "10px",
            width: "400px"
          }}
        >

          <h3>{office.Name}</h3>

          <p>
            <strong>Rent: </strong>

            <span
              style={{
                color: office.Rent < 60000 ? "red" : "green"
              }}
            >
              ₹{office.Rent}
            </span>

          </p>

          <p>
            <strong>Address:</strong> {office.Address}
          </p>

        </div>

      ))}

    </div>
  );
}

export default App;