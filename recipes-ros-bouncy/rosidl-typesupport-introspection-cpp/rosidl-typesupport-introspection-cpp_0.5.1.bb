# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the message type support for dynamic message construction in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-parser rosidl-typesupport-interface rosidl-typesupport-introspection-c"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/bouncy/rosidl_typesupport_introspection_cpp/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "367203b8572a570518d93acff8aa4ac2"
SRC_URI[sha256sum] = "b4e08e0939beb15967f29f6696d2669feb982e962cee790df5aa8907099b5638"
S = "${WORKDIR}/rosidl-release-release-bouncy-rosidl_typesupport_introspection_cpp-0.5.1-0"

inherit catkin
