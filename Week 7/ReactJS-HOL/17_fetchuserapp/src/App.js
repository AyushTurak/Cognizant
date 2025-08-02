import { Component } from "react";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { person: null, loading: false };
  }

  async componentDidMount() {
    this.setState({ loading: true });
    try {
      const response = await fetch("https://api.randomuser.me/");
      const data = await response.json();
      this.setState({ person: data.results[0] }, () => console.log(this.state));
    } catch (e) {
      console.error(e.message);
    } finally {
      this.setState({ loading: false });
    }
  }

  render() {
    return (
      <>
        {this.state.loading ? (
          <p>Loading...</p>
        ) : this.state.person ? (
          <div>
            <h2>
              {this.state.person.name.title} {this.state.person.name.first}{" "}
              {this.state.person.name.last}
            </h2>
            <img
              src={this.state.person.picture.medium}
              alt={this.state.person.first}
            />
          </div>
        ) : (
          <p>No user data available</p>
        )}
      </>
    );
  }
}

export default App;
