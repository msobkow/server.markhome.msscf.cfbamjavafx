// Description: Java 11 JavaFX Display Element Factory for RelationCol.

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
 *	CFBamJavaFXRelationColFactory JavaFX Display Element Factory
 *	for RelationCol.
 */
public class CFBamJavaFXRelationColFactory
implements ICFBamJavaFXRelationColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXRelationColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamRelationColObj argFocus ) {
		CFBamJavaFXRelationColAttrPane retnew = new CFBamJavaFXRelationColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamRelationObj argContainer,
		ICFBamRelationColObj argFocus,
		Collection<ICFBamRelationColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXRelationColListPane retnew = new CFBamJavaFXRelationColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamRelationColObj argFocus,
		ICFBamRelationObj argContainer,
		Collection<ICFBamRelationColObj> argDataCollection,
		ICFBamJavaFXRelationColChosen whenChosen )
	{
		CFBamJavaFXRelationColPickerPane retnew = new CFBamJavaFXRelationColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamRelationColObj argFocus ) {
		CFBamJavaFXRelationColEltTabPane retnew = new CFBamJavaFXRelationColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamRelationColObj argFocus ) {
		CFBamJavaFXRelationColAddPane retnew = new CFBamJavaFXRelationColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamRelationColObj argFocus ) {
		CFBamJavaFXRelationColViewEditPane retnew = new CFBamJavaFXRelationColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamRelationColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXRelationColAskDeleteForm retnew = new CFBamJavaFXRelationColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamRelationColObj argFocus,
		ICFBamRelationObj argContainer,
		Collection<ICFBamRelationColObj> argDataCollection,
		ICFBamJavaFXRelationColChosen whenChosen )
	{
		CFBamJavaFXRelationColPickerForm retnew = new CFBamJavaFXRelationColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamRelationColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXRelationColAddForm retnew = new CFBamJavaFXRelationColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamRelationColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXRelationColViewEditForm retnew = new CFBamJavaFXRelationColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
