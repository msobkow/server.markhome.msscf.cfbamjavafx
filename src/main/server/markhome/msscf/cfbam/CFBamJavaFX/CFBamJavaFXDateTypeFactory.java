// Description: Java 11 JavaFX Display Element Factory for DateType.

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
 *	CFBamJavaFXDateTypeFactory JavaFX Display Element Factory
 *	for DateType.
 */
public class CFBamJavaFXDateTypeFactory
implements ICFBamJavaFXDateTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXDateTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDateTypeObj argFocus ) {
		CFBamJavaFXDateTypeAttrPane retnew = new CFBamJavaFXDateTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamDateTypeObj argFocus,
		Collection<ICFBamDateTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXDateTypeListPane retnew = new CFBamJavaFXDateTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDateTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamDateTypeObj> argDataCollection,
		ICFBamJavaFXDateTypeChosen whenChosen )
	{
		CFBamJavaFXDateTypePickerPane retnew = new CFBamJavaFXDateTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamDateTypeObj argFocus ) {
		CFBamJavaFXDateTypeEltTabPane retnew = new CFBamJavaFXDateTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamDateTypeObj argFocus ) {
		CFBamJavaFXDateTypeAddPane retnew = new CFBamJavaFXDateTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamDateTypeObj argFocus ) {
		CFBamJavaFXDateTypeViewEditPane retnew = new CFBamJavaFXDateTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDateTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXDateTypeAskDeleteForm retnew = new CFBamJavaFXDateTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDateTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamDateTypeObj> argDataCollection,
		ICFBamJavaFXDateTypeChosen whenChosen )
	{
		CFBamJavaFXDateTypePickerForm retnew = new CFBamJavaFXDateTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDateTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXDateTypeAddForm retnew = new CFBamJavaFXDateTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDateTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXDateTypeViewEditForm retnew = new CFBamJavaFXDateTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
