import { useState } from "react";

const ComplainRegister = () => {
  const [name, setName] = useState("");
  const [complaint, setComplaint] = useState("");

  const randNum = () => {
    return (Math.random() * 1000000).toFixed(0);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`Thanks ${name} \n Your reference id is ${randNum()}`);
  };
  return (
    <>
      <h1 style={{ color: "red" }}>Register your complaints here!!!</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="name" style={{ paddingLeft: "2rem" }}>
            Name
          </label>
          <input
            type="text"
            onChange={(e) => setName(e.target.value)}
            value={name}
          />
        </div>

        <div style={{ paddingLeft: "2rem" }}>
          <label htmlFor="complaint">Complaint</label>
          <textarea
            onChange={(e) => setComplaint(e.target.value)}
            value={complaint}
          />
        </div>

        <button type="submit">Submit</button>
      </form>
    </>
  );
};

export default ComplainRegister;
