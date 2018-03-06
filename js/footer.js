
function carregaRodape() {
    document.getElementById('rodape').innerHTML =

 "   <footer>" +
  "              <div class='container-fluid footer-primary'>" +
   "                 <div class='container'>" +
    "                    <div class='row'>" +
     "                       <div class='col-md-4'><div class='logo-footer'><a href='#'><img src='assets/img/logomarca-siga-header.png' class='img-responsive' /></a></div></div>" +
      "                      <div class='col-md-5'>" +
       "                         <p class='footer-address'><span class='text'>Endereço XYZ, nº 433 - Centro - Hogwarts, IF - CEP 12345-678</span><a href='tel:(27)3333-4444'><span class='footer-tel'><small>27</small> 3333-4444</span></a><br /></p>" +
        "                    </div>" +
         "                   <div class='col-md-3'>" +
          "                      <div class='link-group social'><a href='https://twitter.com/siga_es' target='_blank'><i class='flaticon-twitter-logo-button'></i></a> &nbsp; <a href='https://www.facebook.com/sigaonline/' target='_blank'><i class='flaticon-facebook-logo-button'></i></a> &nbsp; <a href='https://www.youtube.com/channel/UCyirkIAl-sa8ifUj149h5_A?sub_confirmation=1' target='_blank'><i class='flaticon-youtube-logotype'></i></a></div>" +
           "                 </div>" +
            "            </div>" +
             "       </div>" +
              "  </div>" +
               " <div class='container-fluid footer-secondary'>" +
                "    <div class='container'>" +
                 "       <div class='menu-footer'>" +
                  "          <div class='row'>" +
                   "             <div class='col-md-2'>" +
                    "                <ul>" +
                     "                   <li class='menu-header-footer'>Cadastro</li>" +
                      "                  <li><a href='./formulario-completo.html'>Formulário - Diagramação</a></li>" +
                       "                 <li><a href='./formularios.html'>Formulário - Componentes</a></li>" +
                        "                <li><a href='./guia-de-estilo.html'>Guia de Estilo</a></li>" +
                         "           </ul>" +
                          "      </div>" +
                           "     <div class='col-md-2'>" +
                            "        <ul>" +
                             "           <li class='menu-header-footer'>Registro de Ponto</li>" +
                              "          <li><a href='#'>Registro X</a></li>" +
                               "         <li><a href='#'>Registro Y</a></li>" +
                                "        <li><a href='#'>Registro Z</a></li>" +
                                 "   </ul>" +
            "                    </div>" +
             "                   <div class='col-md-2'>" +
              "                      <ul>" +
               "                         <li class='menu-header-footer'>Vendas</li>" +
                "                        <li><a href='./acompanhamento-vendas.html'>Acompanhamento</a></li>" +
                 "                       <li><a href='#'>Vendas Y</a></li>" +
                  "                      <li><a href='#'>Vendas Z</a></li>" +
                   "                 </ul>" +
                    "            </div>" +
                     "           <div class='col-md-2'>" +
                      "              <ul>" +
                       "                 <li class='menu-header-footer'>Financeiro</li>" +
                        "                <li><a href='#'>Financeiro X</a></li>" +
                         "               <li><a href='#'>Financeiro Y</a></li>" +
                          "              <li><a href='#'>Financeiro Z</a></li>" +
                           "         </ul>" +
                            "    </div>" +
                             "   <div class='col-md-2'>" +
                              "      <ul>" +
                               "         <li class='menu-header-footer'>Gerenciamento</li>" +
                                "        <li><a href='#'>Gerenciamento X</a></li>" +
                                 "       <li><a href='#'>Gerenciamento Y</a></li>" +
                                  "      <li><a href='#'>Gerenciamento Z</a></li>" +
                                   " </ul>" +
       "                         </div>" +
        "                        <div class='col-md-2'>" +
         "                           <ul>" +
          "                              <li class='menu-header-footer'>Notificações</li>" +
           "                             <li><a href='./guia-de-estilo.html'>Guia de Estilo</a></li>" +
            "                            <li><a href='./erro.html '>Informações</a></li>" +
             "                           <li><a href='#'>Problemas</a></li>" +
              "                      </ul>" +
               "                 </div>" +
                "            </div>" +
                 "       </div>" +
                 "   </div>" +
                  "  <hr />" +
                   " <div class='container'>" +
                    "    <div class='row'>" +
                     "       <div class='col-md-6'>" +
                      "          <span class='text'>© 2018 SIGA. Todos os direitos reservados.</span>" +
                       "     </div>" +
   "                     </div>" +
    "                </div>" +
     "           </div>" +
 "      </footer>";
}

	window.onload = function () {
	    carregaRodape();
	}