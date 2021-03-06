import MovieScore from 'components/MovieScore';
import {Link} from 'react-router-dom';
import './styles.css';
import {Movie} from "../../types/movie";


type Props = {

movie: Movie;

}


function MovieCard({movie}: Props) {



    return (
        <div>
            <img className="dsmovie-movie-card-image" src={movie.imagem} alt={movie.titulo}/>

            <div className="dsmovie-card-bottom-container">
                <h3>{movie.titulo}</h3>
                <MovieScore count={movie.contador} score={movie.pontuacao}/>

                <Link to={`/form/${movie.id}`}>
                    <div className="btn btn-primary dsmovie-btn">Avaliar</div>
                </Link>

            </div>
        </div>
    );
}

export default MovieCard;