# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing demos for lifecycle implementation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake lifecycle-msgs rclcpp-lifecycle ros2run std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/${PN}/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d92c17b2bbc9323bc5ca08ecf2acb5b"
SRC_URI[sha256sum] = "ba439c587c69ca1c2a3ec569d7e3d9d4995aa98c2e7566ad316e8f6cfd3eaac5"
S = "${WORKDIR}/demos-release-release-crystal-${PN}-0.6.2-0"

inherit catkin
