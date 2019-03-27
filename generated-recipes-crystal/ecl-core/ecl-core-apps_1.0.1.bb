# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This includes a suite of programs demo'ing various aspects of the      ecl_core. It also includes various benchmarking and utility programs for      use primarily with embedded systems."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_core_apps"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-command-line \
    ecl-config \
    ecl-containers \
    ecl-converters \
    ecl-devices \
    ecl-errors \
    ecl-exceptions \
    ecl-formatters \
    ecl-geometry \
    ecl-ipc \
    ecl-license \
    ecl-linear-algebra \
    ecl-sigslots \
    ecl-streams \
    ecl-threads \
    ecl-time-lite \
    ecl-type-traits \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-build \
    ecl-command-line \
    ecl-config \
    ecl-containers \
    ecl-converters \
    ecl-devices \
    ecl-errors \
    ecl-exceptions \
    ecl-formatters \
    ecl-geometry \
    ecl-ipc \
    ecl-license \
    ecl-linear-algebra \
    ecl-sigslots \
    ecl-streams \
    ecl-threads \
    ecl-time-lite \
    ecl-type-traits \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_core_apps/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "23f6d93bf03cda8960790808fdbc7b07"
SRC_URI[sha256sum] = "4ecaab4200b12304d57fd077b3027cd57ed8ea021cfd7ab1c8b4299f2ee41134"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_core_apps-1.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/ecl-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}-${PV}.inc

inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}

