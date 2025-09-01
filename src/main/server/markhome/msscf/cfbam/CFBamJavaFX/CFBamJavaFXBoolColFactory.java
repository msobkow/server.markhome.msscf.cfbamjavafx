// Description: Java 11 JavaFX Display Element Factory for BoolCol.

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
 *	CFBamJavaFXBoolColFactory JavaFX Display Element Factory
 *	for BoolCol.
 */
public class CFBamJavaFXBoolColFactory
implements ICFBamJavaFXBoolColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXBoolColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamBoolColObj argFocus ) {
		CFBamJavaFXBoolColAttrPane retnew = new CFBamJavaFXBoolColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamBoolColObj argFocus,
		Collection<ICFBamBoolColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXBoolColListPane retnew = new CFBamJavaFXBoolColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamBoolColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamBoolColObj> argDataCollection,
		ICFBamJavaFXBoolColChosen whenChosen )
	{
		CFBamJavaFXBoolColPickerPane retnew = new CFBamJavaFXBoolColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamBoolColObj argFocus ) {
		CFBamJavaFXBoolColEltTabPane retnew = new CFBamJavaFXBoolColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamBoolColObj argFocus ) {
		CFBamJavaFXBoolColAddPane retnew = new CFBamJavaFXBoolColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamBoolColObj argFocus ) {
		CFBamJavaFXBoolColViewEditPane retnew = new CFBamJavaFXBoolColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamBoolColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXBoolColAskDeleteForm retnew = new CFBamJavaFXBoolColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamBoolColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamBoolColObj> argDataCollection,
		ICFBamJavaFXBoolColChosen whenChosen )
	{
		CFBamJavaFXBoolColPickerForm retnew = new CFBamJavaFXBoolColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamBoolColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXBoolColAddForm retnew = new CFBamJavaFXBoolColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamBoolColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXBoolColViewEditForm retnew = new CFBamJavaFXBoolColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
