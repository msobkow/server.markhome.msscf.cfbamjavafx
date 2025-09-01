// Description: Java 11 JavaFX Display Element Factory for Int16Col.

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
 *	CFBamJavaFXInt16ColFactory JavaFX Display Element Factory
 *	for Int16Col.
 */
public class CFBamJavaFXInt16ColFactory
implements ICFBamJavaFXInt16ColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXInt16ColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamInt16ColObj argFocus ) {
		CFBamJavaFXInt16ColAttrPane retnew = new CFBamJavaFXInt16ColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamInt16ColObj argFocus,
		Collection<ICFBamInt16ColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXInt16ColListPane retnew = new CFBamJavaFXInt16ColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamInt16ColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamInt16ColObj> argDataCollection,
		ICFBamJavaFXInt16ColChosen whenChosen )
	{
		CFBamJavaFXInt16ColPickerPane retnew = new CFBamJavaFXInt16ColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamInt16ColObj argFocus ) {
		CFBamJavaFXInt16ColEltTabPane retnew = new CFBamJavaFXInt16ColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamInt16ColObj argFocus ) {
		CFBamJavaFXInt16ColAddPane retnew = new CFBamJavaFXInt16ColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamInt16ColObj argFocus ) {
		CFBamJavaFXInt16ColViewEditPane retnew = new CFBamJavaFXInt16ColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamInt16ColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXInt16ColAskDeleteForm retnew = new CFBamJavaFXInt16ColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamInt16ColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamInt16ColObj> argDataCollection,
		ICFBamJavaFXInt16ColChosen whenChosen )
	{
		CFBamJavaFXInt16ColPickerForm retnew = new CFBamJavaFXInt16ColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamInt16ColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXInt16ColAddForm retnew = new CFBamJavaFXInt16ColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamInt16ColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXInt16ColViewEditForm retnew = new CFBamJavaFXInt16ColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
