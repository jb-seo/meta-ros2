# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C interfaces for eProsima FastRTPS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rmw rosidl-cmake rosidl-generator-c rosidl-parser rosidl-typesupport-fastrtps-cpp rosidl-typesupport-interface"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/crystal/rosidl_typesupport_fastrtps_c/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "97318c780659b70ed547e3b9dfe5746f"
SRC_URI[sha256sum] = "7b6a807031603ef8dd4c18a8a78316fba8a333fca59e6ff65b6be32da4b5534a"
S = "${WORKDIR}/rosidl_typesupport_fastrtps-release-release-crystal-rosidl_typesupport_fastrtps_c-0.6.1-0"

inherit ament


