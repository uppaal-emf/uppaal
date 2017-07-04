
package org.muml.uppaal.options.properties.constraint;

public class CreationConstraintContributor
		extends
			org.muml.ape.runtime.constraint.DefaultCreationConstraintContributor {

	public CreationConstraintContributor() {

		{
			final org.eclipse.emf.ecore.EClass myClass = org.muml.uppaal.options.OptionsPackage.eINSTANCE
					.getHideOptionExtension();
			final org.eclipse.emf.ecore.EReference opposite = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.eclipse.emf.ecore.EClass oppositeClass = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement();
			final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
					.createOCLExpression("false", opposite, oppositeClass);
			if (expression != null) {
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.muml.ape.runtime.filter.ICreationFilter filter = new org.muml.ape.runtime.filter.ICreationFilter() {

					@Override
					public boolean select(Object object, org.eclipse.emf.ecore.EClass eClass) {
						return !eClass.isSuperTypeOf(myClass)
								|| (object != null && Boolean.TRUE.equals(query.evaluate(object)));
					}

				};
				if (filter != null) {
					addConstraintFilter(opposite, filter);
				}
			}
		}

	}

}
