# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt is a Qt-based framework for GUI development for ROS. It consists of three parts/metapackages<br/>     <ul>      <li>rqt (you're here)</li>      <li><a href="http://ros.org/wiki/rqt_common_plugins">rqt_common_plugins</a> - ROS backend tools suite that can be used on/off of robot runtime.</li>      <li><a href="http://ros.org/wiki/rqt_robot_plugins">rqt_robot_plugins</a> - Tools for interacting with robots during their runtime.</li>     </ul>    rqt metapackage provides a widget <a href="http://ros.org/wiki/rqt_gui">rqt_gui</a> that enables multiple `rqt` widgets to be docked in a single window."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rqt-gui rqt-gui-cpp rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6794568afd34fd06d235f9ab4295d08a"
SRC_URI[sha256sum] = "852d0ed7d6535653d84dba6db0e482c78959bbd87a9b0aa1f922fe2eb20cad4a"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-1.0.2-0"

inherit ament
