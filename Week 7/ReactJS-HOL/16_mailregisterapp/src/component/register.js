import { useState } from "react";

const Register = () => {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const validEmailRegExp = RegExp(
    "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
  );

  const handleSubmit = (event) => {
    event.preventDefault();
    if (name.length < 5) alert("Name must have atleast 5 characters");
    if (!validEmailRegExp.test(email)) alert("Invalid email address");
    if (password.length < 8) alert("Password must have atleast 8 characters");

    alert("Validation Complete");

    setEmail("");
    setName("");
    setPassword("");
  };

  return (
    <div>
      <h1 style={{ color: "red" }}>Register Here!!!</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="name">Name</label>
          <input
            type="text"
            onChange={(e) => setName(e.target.value)}
            value={name}
          />
        </div>

        <div>
          <label htmlFor="email">Email</label>
          <input
            type="text"
            onChange={(e) => setEmail(e.target.value)}
            value={email}
          />
        </div>

        <div>
          <label htmlFor="password">Password</label>
          <input
            type="password"
            onChange={(e) => setPassword(e.target.value)}
            value={password}
          />
        </div>

        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default Register;
