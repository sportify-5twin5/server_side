package com.university;


import java.io.OutputStream;

import org.apache.jena.rdf.model.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
    Model model = JenaEngine.readModel("data/WebSemantiiique.rdf");


    @GetMapping("/arbitre")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherArbitre() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_arbitre.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/entraineur")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherEntraineur() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_entreneur.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/equipe")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherEquipe() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_equipe.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/evenement")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherEvent() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_evenemnt.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/joueur")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherJoueur() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_joueur.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/match")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherMatch() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_match.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/pays")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherPays() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_pays.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }


    @GetMapping("/sport")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherSport() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_sport.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }


    @GetMapping("/stade")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherStade() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_stade.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/supporteur")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherSupporteur() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_supporteur.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/trophee")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherTrophee() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_trophee.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }

    @GetMapping("/ville")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherVille() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query_ville.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }



    @GetMapping("/relationarbitrematch")
    @CrossOrigin(origins = "http://localhost:4200")
    public String afficherRelation1() {
        String NS = "";
        // lire le model a partir d'une ontologie
        if (model != null) {
            // lire le Namespace de l�ontologie
            NS = model.getNsPrefixURI("");

            // apply our rules on the owlInferencedModel
            Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

            // query on the model after inference
            OutputStream res =  JenaEngine.executeQueryFile(inferedModel, "data/query1.txt");
            System.out.println(res);
            return res.toString();


        } else {
            return ("Error when reading model from ontology");
        }
    }




}
