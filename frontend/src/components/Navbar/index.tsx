import React from "react";
import './styles.css';

function Navbar() {

    return (

        <header>

            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>
                        DSMovie
                    </h1>
                    <a href="https://github.com/harrisonmk">
                        <div className="dsmovie-contact-container">
                            IMG
                            <p className="dsmovie-contact-link">/Devsuperior</p>
                        </div>

                    </a>
                </div>
            </nav>
        </header>
    );


}

export default Navbar;