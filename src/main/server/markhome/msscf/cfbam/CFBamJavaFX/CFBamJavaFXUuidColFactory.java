// Description: Java 11 JavaFX Display Element Factory for UuidCol.

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
 *	CFBamJavaFXUuidColFactory JavaFX Display Element Factory
 *	for UuidCol.
 */
public class CFBamJavaFXUuidColFactory
implements ICFBamJavaFXUuidColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXUuidColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUuidColObj argFocus ) {
		CFBamJavaFXUuidColAttrPane retnew = new CFBamJavaFXUuidColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamUuidColObj argFocus,
		Collection<ICFBamUuidColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXUuidColListPane retnew = new CFBamJavaFXUuidColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUuidColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamUuidColObj> argDataCollection,
		ICFBamJavaFXUuidColChosen whenChosen )
	{
		CFBamJavaFXUuidColPickerPane retnew = new CFBamJavaFXUuidColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamUuidColObj argFocus ) {
		CFBamJavaFXUuidColEltTabPane retnew = new CFBamJavaFXUuidColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamUuidColObj argFocus ) {
		CFBamJavaFXUuidColAddPane retnew = new CFBamJavaFXUuidColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamUuidColObj argFocus ) {
		CFBamJavaFXUuidColViewEditPane retnew = new CFBamJavaFXUuidColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUuidColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXUuidColAskDeleteForm retnew = new CFBamJavaFXUuidColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUuidColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamUuidColObj> argDataCollection,
		ICFBamJavaFXUuidColChosen whenChosen )
	{
		CFBamJavaFXUuidColPickerForm retnew = new CFBamJavaFXUuidColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUuidColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXUuidColAddForm retnew = new CFBamJavaFXUuidColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUuidColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXUuidColViewEditForm retnew = new CFBamJavaFXUuidColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
