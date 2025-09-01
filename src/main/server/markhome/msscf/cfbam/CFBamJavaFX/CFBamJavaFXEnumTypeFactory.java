// Description: Java 11 JavaFX Display Element Factory for EnumType.

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
 *	CFBamJavaFXEnumTypeFactory JavaFX Display Element Factory
 *	for EnumType.
 */
public class CFBamJavaFXEnumTypeFactory
implements ICFBamJavaFXEnumTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXEnumTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamEnumTypeObj argFocus ) {
		CFBamJavaFXEnumTypeAttrPane retnew = new CFBamJavaFXEnumTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamEnumTypeObj argFocus,
		Collection<ICFBamEnumTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXEnumTypeListPane retnew = new CFBamJavaFXEnumTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamEnumTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamEnumTypeObj> argDataCollection,
		ICFBamJavaFXEnumTypeChosen whenChosen )
	{
		CFBamJavaFXEnumTypePickerPane retnew = new CFBamJavaFXEnumTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamEnumTypeObj argFocus ) {
		CFBamJavaFXEnumTypeEltTabPane retnew = new CFBamJavaFXEnumTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamEnumTypeObj argFocus ) {
		CFBamJavaFXEnumTypeAddPane retnew = new CFBamJavaFXEnumTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamEnumTypeObj argFocus ) {
		CFBamJavaFXEnumTypeViewEditPane retnew = new CFBamJavaFXEnumTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamEnumTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXEnumTypeAskDeleteForm retnew = new CFBamJavaFXEnumTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamEnumTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamEnumTypeObj> argDataCollection,
		ICFBamJavaFXEnumTypeChosen whenChosen )
	{
		CFBamJavaFXEnumTypePickerForm retnew = new CFBamJavaFXEnumTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamEnumTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXEnumTypeAddForm retnew = new CFBamJavaFXEnumTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamEnumTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXEnumTypeViewEditForm retnew = new CFBamJavaFXEnumTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
