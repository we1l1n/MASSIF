package org.protege.owl.codegeneration.inference;

import java.util.Collection;
import java.util.Set;

import org.protege.owl.codegeneration.names.CodeGenerationNames;
import org.protege.owl.codegeneration.property.JavaPropertyDeclarations;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

public interface CodeGenerationInference {

    OWLReasoner getOWLReasoner();
    
	OWLOntology getOWLOntology();
	
	void preCompute();
	
	void flush();

	Collection<OWLClass> getOwlClasses();
		
	Collection<OWLClass> getSubClasses(OWLClass owlClass);
	
	Collection<OWLClass> getSuperClasses(OWLClass owlClass);
	
	Set<JavaPropertyDeclarations> getJavaPropertyDeclarations(OWLClass cls, CodeGenerationNames names);

	OWLClass getRange(OWLObjectProperty p);
	
	OWLClass getRange(OWLClass owlClass, OWLObjectProperty p);
	
	OWLDatatype getRange(OWLDataProperty p);
	
	OWLDatatype getRange(OWLClass owlClass, OWLDataProperty p);

	Collection<OWLNamedIndividual> getIndividuals(OWLClass owlClass);

	boolean canAs(OWLNamedIndividual i, OWLClass c);

	Collection<OWLClass> getTypes(OWLNamedIndividual i);
	

}
