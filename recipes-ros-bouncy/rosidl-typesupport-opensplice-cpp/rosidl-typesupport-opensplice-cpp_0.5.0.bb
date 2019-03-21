# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C++ interfaces for PrismTech OpenSplice."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "opensplice-cmake-module rmw rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-parser rosidl-typesupport-interface libopensplice67"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/bouncy/rosidl_typesupport_opensplice_cpp/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2c30ec7a39d47c8bf44632d9e6e1c722"
SRC_URI[sha256sum] = "2ef354bd23239576fa33e9b39295e9d155d32f62f9430826ddc784c67dbad041"
S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-bouncy-rosidl_typesupport_opensplice_cpp-0.5.0-0"

inherit ros
inherit ament


