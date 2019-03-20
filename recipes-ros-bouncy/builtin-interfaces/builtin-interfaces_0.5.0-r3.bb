# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing builtin message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/bouncy/builtin_interfaces/0.5.0-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "af3d74391fa34648dd97d501b9c6ad94"
SRC_URI[sha256sum] = "79ce1155a3db482274b3ac0de723ec23ea0bb4b86ef32122189ed9add74cd5af"
S = "${WORKDIR}/rcl_interfaces-release-release-bouncy-builtin_interfaces-0.5.0-3"


inherit ros
inherit ament
inherit pythonpath-insane

