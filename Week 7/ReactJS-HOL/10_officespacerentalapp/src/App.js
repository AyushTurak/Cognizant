const App = () => {
  const element = "Office Space, At Affordable Range";
  const imageAttr = (
    <img
      src="https://images.unsplash.com/photo-1497215728101-856f4ea42174?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
      alt="Office"
      height="25%"
      width="25%"
    />
  );

  const officeObj = {
    name: "DBS",
    rent: 1_20_000,
    address: "Chennai",
  };

  return (
    <div>
      <h1>{element}</h1>
      {imageAttr}
      <h1>Name: {officeObj.name}</h1>
      <h3 style={{ color: officeObj.rent < 60_000 ? "red" : "green" }}>
        Rent: Rs {officeObj.rent}
      </h3>
      <h3>Address: {officeObj.address}</h3>
    </div>
  );
};

export default App;
