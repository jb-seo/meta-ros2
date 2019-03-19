# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Some fast/convenient type converters, mostly for char strings or strings.      These are not really fully fleshed out, alot of them could use the addition for      the whole range of fundamental types (e.g. all integers, not just int, unsigned int).       They will come as the need arises."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_converters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = "ecl-build ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-mpl ecl-type-traits"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "ament-cmake-gtest-native ament-lint-auto-native ament-lint-common-native"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_converters/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "03364dc9554216ab858f74c95ef34da9"
SRC_URI[sha256sum] = "afbd79e5e6b66aa1c4125c46a8b6c5b945fcbb121b37484d9cef931dc671b01b"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_converters-1.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-converters/ecl-converters-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-converters/ecl-converters-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-converters/ecl-converters-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-converters/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-converters/${BPN}-${PV}.inc

inherit ros_bouncy
inherit ros_${ROS_BUILD_TYPE}

