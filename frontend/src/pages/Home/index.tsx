import Footer from "assets/components/Footer";
import NavBar from "assets/components/NavBar/indext";
import { Link } from 'react-router-dom';

const Home = () => {
  return (
    <>
      <NavBar />
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">DSVendas</h1>
          <p className="lead">
            Analise o desempenho das suas vendas por diferentes perspectivas
          </p>
          <hr />
          <p>
            Esta aplicação consiste em exibir um dashboard a partir de dados
            fornecidos por um back end construído com Spring Boot.
          </p>
          <Link to="/dashboard" className="btn btn-dark">
            Acessar a dashboard de vendas
          </Link>
        </div>
      </div>
      <Footer />
    </>
  );
};

export default Home;
