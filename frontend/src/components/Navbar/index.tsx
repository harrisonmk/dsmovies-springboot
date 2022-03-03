import React from "react";
import './styles.css';
import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import {Link} from "react-router-dom";

function Navbar() {

    return (

        <header>

            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>
                        <Link to="/">
                        DSMovie
                        </Link>
                    </h1>
                    <a href="https://github.com/harrisonmk">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/Devsuperior</p>
                        </div>

                    </a>
                </div>
            </nav>
        </header>
    );


}

export default Navbar;