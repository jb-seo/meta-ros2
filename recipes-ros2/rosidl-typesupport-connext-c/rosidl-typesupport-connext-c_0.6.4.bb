# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C interfaces for RTI Connext."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake connext-cmake-module rmw rosidl-cmake rosidl-generator-c rosidl-parser rosidl-typesupport-connext-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/crystal/rosidl_typesupport_connext_c/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "094f59487d48648bd5c99068b674a160"
SRC_URI[sha256sum] = "203f5177188d336538c2f0443dffcdd7226c418de48806f85f832e2ac416ad2b"
S = "${WORKDIR}/rosidl_typesupport_connext-release-release-crystal-rosidl_typesupport_connext_c-0.6.4-0"

inherit catkin
