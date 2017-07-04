
package org.muml.uppaal.properties.metamodel;

public class MetamodelContributor implements org.muml.ape.runtime.metamodel.IMetamodelContributor {

	/**
	 * @generated
	 */
	public java.util.List<org.eclipse.emf.common.notify.AdapterFactory> getItemProviderFactories() {
		java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories = new java.util.ArrayList<org.eclipse.emf.common.notify.AdapterFactory>();
		fillItemProviderFactories(factories);
		return factories;
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(java.util.List<org.eclipse.emf.common.notify.AdapterFactory> factories) {

		factories.add(new org.muml.uppaal.templates.provider.TemplatesItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.statements.provider.StatementsItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.provider.UppaalItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.types.provider.TypesItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.core.provider.CoreItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.declarations.system.provider.SystemItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.expressions.provider.ExpressionsItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.declarations.global.provider.GlobalItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.visuals.provider.VisualsItemProviderAdapterFactory());

		factories.add(new org.muml.uppaal.declarations.provider.DeclarationsItemProviderAdapterFactory());

	}

}
