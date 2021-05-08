import BarChart from 'assets/components/BarChart';
import DataTable from 'assets/components/DataTable';
import DonutChart from 'assets/components/DonutChart';
import Footer from 'assets/components/Footer';
import NavBar from 'assets/components/NavBar/indext';

const Dashboard = () => {
  return (
    <>
      <NavBar />
      <div className="container">
        <h2 className="text-primary py-4">Dashboard de Vendas</h2>

        <div className="row px-3 py-2">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">
              Participações nas vendas
            </h5>
            <DonutChart />
          </div>
        </div>
        <div className="py-4">
          <h2 className="text-primary">Todas as Vendas</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
};

export default Dashboard;
