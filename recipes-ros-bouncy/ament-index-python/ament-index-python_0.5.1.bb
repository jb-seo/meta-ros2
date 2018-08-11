# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python API to access the ament resource index."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_index-release/archive/release/bouncy/ament_index_python/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ced4065dba8470af59608698eaa2c297"
SRC_URI[sha256sum] = "2ad46b53939aad235ce8e43b4e54b562f0795325cb485cef2777042013b39fe9"
S = "${WORKDIR}/ament_index-release-release-bouncy-ament_index_python-0.5.1-0"

inherit catkin
