package org.muml.uppaal.scoping;

import org.eclipse.xtext.naming.QualifiedName;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.parsable.IdentifiableLocation;
import org.muml.uppaal.types.Type;

public class UppaalQualifiedNameProvider extends org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider {

	QualifiedName qualifiedName(IdentifiableLocation l) {
        return QualifiedName.create(l.getId());
    }
	
	QualifiedName qualifiedName(Type t) {
        return QualifiedName.create(t.getName());
    }
	
	QualifiedName qualifiedName(NamedElement n)
	{
		return QualifiedName.create(n.getName());
	}
	
}
