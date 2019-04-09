# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "AprilTag2 detection node"
AUTHOR = " <Rauch.Christian@gmx.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BUILD_DEPENDS = " \
    apriltag \
    apriltag-msgs \
    class-loader \
    libeigen \
    rclcpp \
    sensor-msgs \
    tf2-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    apriltag \
    apriltag-msgs \
    class-loader \
    rclcpp \
    sensor-msgs \
    tf2-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/christianrauch/apriltag2_node-release/archive/release/crystal/apriltag2_node/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a644bf7e34c989ac26044884d6b105f6"
SRC_URI[sha256sum] = "096c7aba240c1767464228f85390ab0162b0443d470887944047d7b0b9e56f08"
S = "${WORKDIR}/apriltag2_node-release-release-crystal-apriltag2_node-1.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/apriltag2-node/apriltag2-node_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/apriltag2-node/apriltag2-node_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/apriltag2-node/apriltag2-node-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/apriltag2-node/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/apriltag2-node/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
