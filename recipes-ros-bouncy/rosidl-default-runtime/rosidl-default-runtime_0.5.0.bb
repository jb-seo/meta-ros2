# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A configuration package defining the runtime for the ROS interfaces."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-generator-cpp rosidl-generator-py rosidl-typesupport-c rosidl-typesupport-cpp rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosidl_defaults-release/archive/release/bouncy/rosidl_default_runtime/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b0502ce5ec960094756adf05d8e45a81"
SRC_URI[sha256sum] = "736477c678ce80595c3aee53aa8edc8c591e4a30af29d0485e6e7c2d35355608"
S = "${WORKDIR}/rosidl_defaults-release-release-bouncy-rosidl_default_runtime-0.5.0-0"

inherit ros
inherit ament


