# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal service clients using rclpy."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "example-interfaces rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclpy_minimal_client/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1e1894f9c0a68b54e9c0832e16daedcd"
SRC_URI[sha256sum] = "e9fcfc0d55a4797bf6c9b6313816d9ef73301239cc8201018b567e81897b298b"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclpy_minimal_client-0.6.2-0"

inherit ament
