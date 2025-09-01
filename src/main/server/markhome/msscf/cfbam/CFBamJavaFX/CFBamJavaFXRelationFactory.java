// Description: Java 11 JavaFX Display Element Factory for Relation.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXRelationFactory JavaFX Display Element Factory
 *	for Relation.
 */
public class CFBamJavaFXRelationFactory
implements ICFBamJavaFXRelationFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXRelationFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamRelationObj argFocus ) {
		CFBamJavaFXRelationAttrPane retnew = new CFBamJavaFXRelationAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamRelationObj argFocus,
		Collection<ICFBamRelationObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXRelationListPane retnew = new CFBamJavaFXRelationListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamRelationObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamRelationObj> argDataCollection,
		ICFBamJavaFXRelationChosen whenChosen )
	{
		CFBamJavaFXRelationPickerPane retnew = new CFBamJavaFXRelationPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamRelationObj argFocus ) {
		CFBamJavaFXRelationEltTabPane retnew = new CFBamJavaFXRelationEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamRelationObj argFocus ) {
		CFBamJavaFXRelationAddPane retnew = new CFBamJavaFXRelationAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamRelationObj argFocus ) {
		CFBamJavaFXRelationViewEditPane retnew = new CFBamJavaFXRelationViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamRelationObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXRelationAskDeleteForm retnew = new CFBamJavaFXRelationAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamRelationObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamRelationObj> argDataCollection,
		ICFBamJavaFXRelationChosen whenChosen )
	{
		CFBamJavaFXRelationPickerForm retnew = new CFBamJavaFXRelationPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamRelationObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXRelationAddForm retnew = new CFBamJavaFXRelationAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamRelationObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXRelationViewEditForm retnew = new CFBamJavaFXRelationViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
