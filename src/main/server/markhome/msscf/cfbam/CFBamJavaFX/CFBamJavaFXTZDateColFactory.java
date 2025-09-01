// Description: Java 11 JavaFX Display Element Factory for TZDateCol.

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
 *	CFBamJavaFXTZDateColFactory JavaFX Display Element Factory
 *	for TZDateCol.
 */
public class CFBamJavaFXTZDateColFactory
implements ICFBamJavaFXTZDateColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXTZDateColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTZDateColObj argFocus ) {
		CFBamJavaFXTZDateColAttrPane retnew = new CFBamJavaFXTZDateColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamTZDateColObj argFocus,
		Collection<ICFBamTZDateColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXTZDateColListPane retnew = new CFBamJavaFXTZDateColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTZDateColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTZDateColObj> argDataCollection,
		ICFBamJavaFXTZDateColChosen whenChosen )
	{
		CFBamJavaFXTZDateColPickerPane retnew = new CFBamJavaFXTZDateColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamTZDateColObj argFocus ) {
		CFBamJavaFXTZDateColEltTabPane retnew = new CFBamJavaFXTZDateColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamTZDateColObj argFocus ) {
		CFBamJavaFXTZDateColAddPane retnew = new CFBamJavaFXTZDateColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamTZDateColObj argFocus ) {
		CFBamJavaFXTZDateColViewEditPane retnew = new CFBamJavaFXTZDateColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTZDateColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXTZDateColAskDeleteForm retnew = new CFBamJavaFXTZDateColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTZDateColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTZDateColObj> argDataCollection,
		ICFBamJavaFXTZDateColChosen whenChosen )
	{
		CFBamJavaFXTZDateColPickerForm retnew = new CFBamJavaFXTZDateColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTZDateColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXTZDateColAddForm retnew = new CFBamJavaFXTZDateColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTZDateColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXTZDateColViewEditForm retnew = new CFBamJavaFXTZDateColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
