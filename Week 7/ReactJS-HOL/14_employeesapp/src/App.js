import "./App.css";
import { EmployeesData } from "./Employee";
import EmployeesList from "./EmployeesList";
import { useTheme } from "./components/ThemeContext";
function App() {
  const Employees = EmployeesData;
  const { setTheme } = useTheme();
  return (
    <>
      <div>
        <label>SELECT A THEME </label>
        <select onChange={(e) => setTheme(e.target.value)}>
          <option value="light">Light</option>
          <option value="dark">Dark</option>
        </select>
      </div>
      <EmployeesList employees={Employees} />
    </>
  );
}

export default App;
