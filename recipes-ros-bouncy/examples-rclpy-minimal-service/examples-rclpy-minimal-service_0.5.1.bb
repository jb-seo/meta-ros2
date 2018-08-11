# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal service servers using rclpy."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "example-interfaces rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclpy_minimal_service/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78c3cfd5ae532f4ec0c31b3fb716dd7a"
SRC_URI[sha256sum] = "66fa86d09261256292fe1e0322919f3e55e3c99589685042c76a2890743b901a"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclpy_minimal_service-0.5.1-0"

inherit catkin
